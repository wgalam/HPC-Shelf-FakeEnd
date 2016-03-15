import java.io.IOException;
import br.ufc.storm.io.FileHandler;
import br.ufc.storm.io.RuntimeExecHandler;

public class FakeEndServices {

	public boolean addFile(String fullPath, byte [] file){
		return FileHandler.addFile(fullPath, file);
	}
	
	public byte[] getFile(String pathname){
		try {
			return FileHandler.readFile(pathname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String removeFile(String path){
		return RuntimeExecHandler.run("rm "+path);
		
	}
	
	public String renameFile(String oldPath, String newPath){
		return RuntimeExecHandler.run("mv "+oldPath+" "+newPath);
	}

	public String runFile(String path){
		return RuntimeExecHandler.run(path);
	}
	
	public String runCommand(String script){
		return RuntimeExecHandler.run(script);
	}

	public boolean destroy(){
		return true;
	}

	public String getStatus(){
		return "This is ok";
	}
	
	
}
