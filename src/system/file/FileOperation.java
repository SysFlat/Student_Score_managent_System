package system.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import system.object.Student;

public class FileOperation {
	public static ArrayList<Student> studentArray = new ArrayList<Student>();
	
	/*
	 * ��ȡ�����ļ�
	 */
	public static void readFile( )
	{
		String dataLineString;
		/*
		 * �ܹ���7��
		 */
		String arr[] = null;

		try {
			BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		
			while((dataLineString = reader.readLine()) != null)
			{
				//System.out.println(dataLineString);
				arr = dataLineString.split("\\s+");
				
				/*
				 * ��ʼ������
				 */

				studentArray.add(new Student(
						arr[0],
						arr[1],
						arr[2],
						arr[3],
						Float.parseFloat(arr[4]),
						Float.parseFloat(arr[5]),
						Float.parseFloat(arr[6])
						));	
			}
			
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static int getStudentNum()
	{
		return studentArray.size();
	}
	public static Student getStudent(int index)
	{
		return studentArray.get(index);
	}
}
