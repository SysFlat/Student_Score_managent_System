package system.operation;

import java.util.Scanner;

import system.file.FileOperation;
import system.object.Student;



public final class SortFunction {
	/*
	 * ����ƽ���ɼ���������
	 */
	public static void descendByAverage()
	{
		int [] arrayList = new int[FileOperation.getStudentNum()];
		int temp = 0;
		System.out.println("����ƽ���ɼ���������Ϊ��\n\n");
		
		for(int i = 0; i < arrayList.length; i++)
			arrayList[i]  = i;
		/*
		 * ��ƽ���ɼ�����ð������
		 */
		for(int i = 0; i < arrayList.length - 1; i++)
		{
			for(int j = 0; j < arrayList.length - 1 - i; j++)
			{
				if(FileOperation.student[arrayList[j]].getScoreAverage() > 
				   FileOperation.student[arrayList[j+1]].getScoreAverage())
				{
					temp = arrayList[j];
					arrayList[j] = arrayList[j + 1];
					arrayList[j + 1] = temp;
				}
			}
		}
		
		System.out.println("\tѧ��\t����\t�Ա�\tѧԺ\t��Ŀһ\t��Ŀ��\t��Ŀ��\tƽ����");
		for(int i = arrayList.length - 1; i >= 0 ; i--)
			QueryFunction.showOneStudentInfo(arrayList[i]);
		
		System.out.println("���»س����˳�..........\n\n");
		new Scanner(System.in).nextLine();
		

	}
	
	/*
	 * ����������������
	 */
	public static void ascendByName()
	{
		System.out.println("����������������Ϊ: \n");
	}
}
