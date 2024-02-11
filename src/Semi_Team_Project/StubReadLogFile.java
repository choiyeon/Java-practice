package Semi_Team_Project;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

public class StubReadLogFile {

	private List<String> logLines;
	private long timeStart, timeEnd;
	
	public StubReadLogFile(File file) throws IOException, NoSuchFileException {	
	} // ReadLogFile
	
	public List<LogInfoVO> getLogInfo(boolean strictUrlPattern) throws LooksLikeNotLogFileException{
		List<LogInfoVO> logInfo = new ArrayList<LogInfoVO>();
		
		return logInfo;
	}
	
}
