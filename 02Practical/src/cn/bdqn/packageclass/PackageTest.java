package cn.bdqn.packageclass;

import org.junit.Test;

public class PackageTest {

	// ���еķ�װ�� ���н���Ӧ�Ļ�������������Ϊ�����ķ��� ������ʵ��
	@Test
	public void test01() {
		/**
		 * Float������ʵ�������췽��  �ֱ���  ���� double  float  String
		 * ��������ֵ���Ͷ������ֹ��죡
		 * Characterֻ��һ�����죡
		 */
		Byte a = new Byte((byte) 1);
		Short s = new Short((short) 1);
		Integer b = new Integer(5);
		Long l = new Long(1);
		Float f = new Float(2);
		Double c = new Double(5);
		// �����������װ�඼�̳���Number
		Boolean boolean1 = new Boolean(true);
		Character character1 = new Character((char) 1);
		Character character2 = new Character('1');

	}

	/**
	 * ������װ��̳���Number
	 * ��String������ʵ����ʱ��String�д�ŵı�������ֵ���͵��ַ���
	 * ����Character������ʵ����ʱ��û��String���͵Ĳ�����
	 * ����7�ַ�װ�� �����Դ���һ��Stirng���͵ı�����������ʵ����
	 * ע��㣺
	 *    Stirng���͵ı���������ת������ֵ���ͣ�������׳��쳣(NumberFormatException)��
	 */
	@Test
	public void test02() {
		Byte a = new Byte("1");
		Short s = new Short("1");
		Integer b = new Integer("1");
		Long l = new Long("1");
		Float f = new Float("1");
		Double c = new Double("1");
		// ���˴�Сд��true ����������false
		Boolean boolean1 = new Boolean("");
		System.out.println(boolean1);
		// ���뱨�� Character character1 = new Character("1");
	}

}
