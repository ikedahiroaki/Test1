package UriageShukei;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class UriageShukei{


	public static void main(String[] args) throws IOException{
		//指定されたディレクトリ
		File directory = new File(args [0]);

		//1.支店定義ファイル

		File branchFile = new File(directory + "\\branch.lst");

		//変数の宣言
		FileInputStream fis = new FileInputStream(branchFile);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		ArrayList<String []> branchData = new ArrayList<String []>();
		//支店定義の処理

			if(!branchFile.exists()) {
				System.out.println("支店定義ファイルが存在しません");
				return;
			}





		fis = new FileInputStream(branchFile);
		isr = new InputStreamReader(fis);
		br = new BufferedReader(isr);
		String line;
		while((line = br.readLine()) != null){
			String[] branch = line.split(",");
		//配列の長さ
			if(branch.length != 2 || branch [0] == null || branch [1] == null){
				System.out.println("支店定義ファイルのフォーマットが不正です");
				return;
			}

		}



		//2.商品定義ファイル

		File commodityFile = new File(directory + "\\commodity.lst");
		ArrayList<String[]> commodityData = new ArrayList<String[]>();

		//商品定義の処理
		if(!commodityFile.exists()){
			System.out.println("商品定義ファイルは存在しません");
			return;
		}

		fis = new FileInputStream(commodityFile);
		isr = new InputStreamReader(fis);
		br = new BufferedReader(isr);

		while((line = br.readLine()) != null){
			String [] commodity = line.split(",");
		//配列の長さ
			if(commodity.length!= 2 || commodity [0] == null || commodity [1] == null ){
				System.out.println("商品定義ファイルのフォーマットが不正です");
				return;
			}
		}



		//3.集計

		//.rcdに該当する拡張子を検索
		ArrayList<String[]> salesData = new ArrayList<String[]>();
		String[] salesFiles = directory.list();
			for (String salesFile : salesFiles) {
				if (!salesFile.endsWith(".rcd")) {
				continue;
		}
	}
}


