package cn.bdqn.listtest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/**
		 * �ڳ������й�����,��ȷ���ж��ٸ�����  ���뵽 ������!
		 * ʹ�ü��Ͽ��!
		 * ���� ������ ����   LinkedList
		 * ���� ������ ��ѯ   ArrayList
		 * ������������  ����  List�ӿڵ� ʵ���࣡
		 * 
		 * 01. ArrayList �ײ���ʵ����һ���ɱ䳤�ȣ��Զ����ݣ������飡
		 *     ���ڴ���Ҳ�Ƿ��������Ŀռ䣡
		 *     ����Ԫ�غ��������Ԫ�ص�ʱ�� ���ܸߣ�  ��Ϊ���±꣡
		 *     
		 *    ˭�ܸ����ң�����
		 *    Ϊʲô��ʹ�� !!!!
		 *   ArrayList list=  new ArrayList();
		 *   
		 *    List  �� ArrayList ʲô��ϵ��
		 *      001.ArrayList�̳���List��
		 *    List�ӿ����еķ���ArrayList����  
		 *      002. ��
		 *    ArrayList�������еķ�����  List�ӿ�������
		 *      003. û�У�
		 *      
		 *     List list = new ArrayList();   ���������ָ��������Ķ���
		 *     
		 * 
		 */

		// 01����һ��ArrayList����
		ArrayList list = new ArrayList();
		/**
		 *  02. �򼯺�������Ԫ��
		 *    Ϊʲô���Դ����ô����������
		 *    ��Ϊ�ײ����һ��Object[]����   Ĭ�ϵĳ�ʼ����=10
		 *    Object ������ĸ��࣬���Կ��Դ���κ����ͣ�
		 *  
		 */
		list.add(1);
		list.add("2");
		list.add(12.5);
		list.add('1');
		list.add('1');
		list.add(null);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		// 03.������ϵĳ��� ʵ��ʹ�õ�λ�ø���
		System.out.println(list.size());

	}
}
