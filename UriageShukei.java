package UriageShukei;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

 class UriageShukei {
	public static void main(String []args){

		// 指定されたディレクトリ
		File file = new File(args[0]);



		// 1.支店定義ファイル

	   file = new File("\\branch.lst");


		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		BufferedReader br = new BufferedReader(isr);




		// 支店定義の処理

		if (!file.exists()) {
			System.out.println("支店定義ファイルが存在しません");
			return;
		}

		fis = new FileInputStream(file);
		isr = new InputStreamReader(fis,"UTF-8");
		br = new BufferedReader(isr);
		String line;

		while ((line = br.readLine()) != null) {
			String[] branch = line.split(",");
			// 配列の長さ

			System.out.println("支店定義ファイルのフォーマットが不正です");
				return;


		}

		// 2.商品定義ファイル

		File commodityFile = new File("\\commodity.lst");



		FileInputStream fs = new FileInputStream(commodityFile);
		InputStreamReader ir = new InputStreamReader(fs,"UTF-8");
		BufferedReader b = new BufferedReader(ir);

		//HashMap<String, String> commondity = new HashMap<String, String>();


		// 商品定義の処理
		if (!commodityFile.exists()) {
			System.out.println("商品定義ファイルは存在しません");
			return;
		}

		fs = new FileInputStream(commodityFile);
		ir = new InputStreamReader(fs,"UTF-8");
		b = new BufferedReader(ir);

		while ((line = br.readLine()) != null) {
			String[] commodity = line.split(",");
			// 配列の長さ

				System.out.println("商品定義ファイルのフォーマットが不正です");
				return;
			}
		}

		// 3.集計

		// .rcdに該当する拡張子を検索
		// HashMap<String, String> salesData = new HashMap<String, String>();

		String[] salesFiles = directory.list();
		for (String salesFile : salesFiles) {
			if (!salesFile.endsWith(".rcd")) {
				System.out.println("売上ファイル名が連番になっていません");
				return;

			}

			File rcdFile = new File("\\" + salesFile);
			fis = new FileInputStream(rcdFile);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);

			String branch = br.readLine();
			String salesCommodity = br.readLine();
			String price = br.readLine();

		}
	}
}
