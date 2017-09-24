package cn.bdqn.test;

import org.junit.Test;

import cn.bdqn.bean.Student;

public class ReflectDemo {

	/**
	 * ȫ�����������޶�����cn.bdqn.test.ReflectDemo
	 *  ����+����
	 *  
	 * ����·��  /Reflect/src/cn/bdqn/test/ReflectDemo.java
	 * 
	 * 
	 * �����޶��� �����Ƿ���Ļ�����
	 * ���⣺
	 *     01.һ�����п��ܳ���������ͬ�����𣿣�  ����
	 *     02.�����޶���������ȷ���������Ψһ��
	 *     03.������ô��ȡ�����޶����أ�
	 */
	@Test
	public void test01() {
		// ���ַ�ʽ��ȡ���ǵ������޶���
		try {
			System.out.println("��һ�ַ�ʽ ��Class.forName()===>"
					+ Class.forName("cn.bdqn.bean.Student").getName());

			System.out.println("�ڶ��ַ�ʽ ������.Class===>" + Student.class.getName());
			System.out.println("�����ַ�ʽ ��������.getClass()===>"
					+ new Student().getClass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	class A {
	}

	class B {
	}
}
