package com.wjliuh.travel;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class NewFileVisitor extends SimpleFileVisitor<Path> {

	public NewFileVisitor(Path path) {
		super();
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
			throws IOException {
		Objects.requireNonNull(dir);
		Objects.requireNonNull(attrs);
		return FileVisitResult.CONTINUE;
	}
}
