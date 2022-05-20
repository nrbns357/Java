package kr.pe.batang.javaClass.exam.commander;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {

		File dir = new File((currentDirectory).toString());
		File[] childrenFiles = dir.listFiles();
		for (File file : childrenFiles) {
			String lastModify = formatDate(convertTiDate(file.lastModified()));
			String checkDir = dirCheck(file.isDirectory());
			String kmg = lengthGMK(file.isDirectory(), file.length());
			System.out.printf("%7s %7s %7s %s\n", lastModify, checkDir, kmg, file.getName());
		}

		return currentDirectory;
	}

	public Date convertTiDate(long unixTime) {
		return new Date(unixTime);
	}

	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public String lengthGMK(boolean isDir, long size) {
		String GMK = "";
		if (!isDir) {
			if (size < 1000) {
				GMK = size + "";
			} else if (size >= 1000000000) {
				GMK = size / 1000000000 + "G";
			} else if (size >= 1000000) {
				GMK = size / 1000000 + "M";
			} else if (size >= 1000) {
				GMK = size / 1000 + "k";
			}
		}
		return GMK;
	}

	public String dirCheck(boolean dir) {
		if (dir) {
			return "<DIR>";
		} else {
			return "";
		}
	}

}