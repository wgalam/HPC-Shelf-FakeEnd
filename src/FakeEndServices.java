import java.io.IOException;
import br.ufc.storm.io.FileHandler;
import br.ufc.storm.io.RuntimeExecHandler;

public class FakeEndServices {
	static String base = "/tmp/";
	
	public static boolean addFile(String fullPath, byte [] file){
		return FileHandler.addFile(base+fullPath, file);
	}
	
	public static byte[] getFile(String pathname){
		try {
			return FileHandler.readFile(base+pathname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String removeFile(String path){
		return RuntimeExecHandler.run("rm "+base+path);
		
	}
	
	public static String renameFile(String oldPath, String newPath){
		return RuntimeExecHandler.run("mv "+base+oldPath+" "+base+newPath);
	}

	public static String setRunnable(String path){
		RuntimeExecHandler.run("chmod +x "+ base+path);
		return RuntimeExecHandler.run(base+path);
	}
	
	public static String runFile(String path){
		return RuntimeExecHandler.run(base+path);
	}
	
	public static boolean destroy(){
		return true;
	}

	public static String getStatus(){
		return "This is ok";
	}
	
	public static String blablabla(){
		return "This is ok";
	}
	
}
