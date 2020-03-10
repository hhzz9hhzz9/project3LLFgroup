package com.woniu.util;

import java.util.List;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.PrimitiveTypeWrapper;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.AbstractJavaGenerator;

/**
 * MyBatis MySQL�Զ����ɴ���ҳ���
 * 
 * @author wangmengjun
 *
 */
public class MysqlPaginationPlugin extends PluginAdapter {

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		addLimit(topLevelClass, introspectedTable, "limitStart");
		addLimit(topLevelClass, introspectedTable, "limitSize");
		return super.modelExampleClassGenerated(topLevelClass,
				introspectedTable);
	}

	/**
	 * ΪselectByExample���limitStart��limitSize
	 */
	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement isNotNullElement = new XmlElement("if");
		isNotNullElement.addAttribute(new Attribute("test",
				"limitStart != null and limitSize >= 0"));
		isNotNullElement.addElement(new TextElement(
				"limit #{limitStart} , #{limitSize}"));
		element.addElement(isNotNullElement);
		return super.sqlMapSelectByExampleWithoutBLOBsElementGenerated(element,
				introspectedTable);
	}

	/**
	 * ΪselectByExampleWithBLOBs���limitStart��limitSize
	 */
	@Override
	public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(
			XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement isNotNullElement = new XmlElement("if");
		isNotNullElement.addAttribute(new Attribute("test",
				"limitStart != null and limitSize >= 0"));
		isNotNullElement.addElement(new TextElement(
				"limit #{limitStart} , #{limitSize}"));
		element.addElement(isNotNullElement);
		return super.sqlMapSelectByExampleWithBLOBsElementGenerated(element,
				introspectedTable);
	}

	private void addLimit(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable, String name) {

		CommentGenerator commentGenerator = context.getCommentGenerator();

		/**
		 * �������Ա���� ��protected Integer limitStart;
		 */
		Field field = new Field(name, null);
		field.setVisibility(JavaVisibility.PROTECTED);
		field.setType(PrimitiveTypeWrapper.getIntegerInstance());
		field.setName(name);
		commentGenerator.addFieldComment(field, introspectedTable);
		topLevelClass.addField(field);
		/**
		 * ����ĸ��д
		 */
		char c = name.charAt(0);
		String camel = Character.toUpperCase(c) + name.substring(1);

		/**
		 * ���Setter����
		 */
		Method method = new Method("set" + camel);
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setName("set" + camel);
		method.addParameter(new Parameter(PrimitiveTypeWrapper
				.getIntegerInstance(), name));

		StringBuilder sb = new StringBuilder();
		sb.append("this.");
		sb.append(name);
		sb.append(" = ");
		sb.append(name);
		sb.append(";");
		/**
		 * �� this.limitStart = limitStart;
		 */
		method.addBodyLine(sb.toString());

		commentGenerator.addGeneralMethodComment(method, introspectedTable);
		topLevelClass.addMethod(method);

		/**
		 * ���Getter Method ֱ�ӵ���AbstractJavaGenerator��getGetter����
		 */
		Method getterMethod = AbstractJavaGenerator.getGetter(field);
		commentGenerator.addGeneralMethodComment(getterMethod,
				introspectedTable);
		topLevelClass.addMethod(getterMethod);
	}

	public boolean validate(List<String> warnings) {
		return true;
	}

}