package kr.pe.batang.javaClass.exam.commander;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		if (commandLine.substring(3).equals("..")) {
			return ChangeOutFile();
		} else {
			return ChangeInFile();
		}
	}

	public File ChangeInFile() {
		File file = new File((currentDirectory).toString());
		String command = this.commandLine.trim();
		String changeCd = command.substring(3);
		File changefile = new File(currentDirectory + "/" + changeCd);
		if (changefile.exists()) {
			file.renameTo(changefile);
			return changefile;
		} else {
			System.out.println("cannot find the path");
			return currentDirectory;
		}
	}

	public File ChangeOutFile() {
		if(this.currentDirectory.toString().equals("C:\\")) {
			System.out.println("cannot find the path");
			return currentDirectory;
		}
		String currentdir = this.currentDirectory.toString();
		String changedir = currentdir.substring(0, currentdir.lastIndexOf("\\") + 1);
		
		File backfile = new File(changedir);
		return backfile;
	}

}
