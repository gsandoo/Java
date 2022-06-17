package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		
		// 강제 캐스팅 하면 이런 오류가 난다.
//		int iNum = 255;
//		byte bNum = (byte)iNum  ;
//		System.out.println(bNum);//-1
		
		
//		double dNum  =3.14;
//		int iNum = (int)dNum;
//		System.out.println(iNum);
		
		double dnum = 2.2;
		float fnum = 0.9f;
		int inum1= (int)dnum+(int)fnum;
		int inum2 =(int)(dnum+fnum);
		
		System.out.println(inum1); //2
		System.out.println(inum2); //3
	}

}
