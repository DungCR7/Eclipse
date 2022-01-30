package bai1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten");
		String hoVaTen = sc.nextLine();
		System.out.println("Diem trung binh");
		float diemTrungBinh = sc.nextFloat();
		System.out.println("1+1 bang mấy ?");
		double coNguoiYeuChua =sc.nextDouble();
		System.out.println("Ho va ten " + hoVaTen);
		System.out.println("Diem trung binh " + diemTrungBinh);
		System.out.println("1+1 bằng mấy " + coNguoiYeuChua);

	}
}