package br.ufc.storm.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RuntimeExecHandler {


	private static String printLines(String name, InputStream ins) throws Exception {
		String line = null;
		BufferedReader in = new BufferedReader(
				new InputStreamReader(ins));
		String out = "";
		while ((line = in.readLine()) != null) {
			out+=line+"\n";
		}
		return out;
	}

	public static String run(String command){
		String ok = "";
		String error = "";

		try {
			Process pro = Runtime.getRuntime().exec(command);
			ok = printLines(command + " stdout:", pro.getInputStream());
			error = printLines(command + " stderr:", pro.getErrorStream());
			pro.waitFor();
		} catch (Exception e) {
			return "An error occured while trying to execute the component";
		}
		return ok+error;

	}
//
//	public static String run_old(String command){
//		try {
//			Process process = Runtime.getRuntime().exec(command);
//			InputStream in = process.getInputStream();
//			BufferedReader bfReader = new BufferedReader(new InputStreamReader(in));
//			String temp;
//			String out = "";
//			while((temp = bfReader.readLine()) != null){
//				out+=temp+"\n";
//			}
//			process.waitFor();
//			bfReader.close();
//			in.close();
//			return out;
//		} catch (IOException e) {
//			return "An error occured while trying to execute the component";
//		} catch (InterruptedException e) {
//			return "An error occured while trying to execute the component";
//		}
//	}
}
