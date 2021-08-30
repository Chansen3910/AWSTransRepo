
MAKEFLAGS += --silent
ROOTDIR=DA-Lab-2
PACKAGE=labtwo
JARNAME=JavaMake.jar
MAIN=tech.collin.$(PACKAGE).Main
SOURCE=src/tech/collin/$(PACKAGE)/
FILES=-C build .
DEPENDENCIES=-cp D:/JAVA-MAKE/$(ROOTDIR)/external/*.jar

run: clean
	java -jar $(JARNAME)

clean: archive
	rd /Q /S build

archive: manifest
	jar cfM $(JARNAME) $(FILES)

manifest: compile
	echo f | xcopy D:\JAVA-MAKE\$(ROOTDIR)\MANIFEST.MF D:\JAVA-MAKE\$(ROOTDIR)\build\META-INF\MANIFEST.MF /Y

compile:
	javac $(DEPENDENCIES) -d ./build $(SOURCE)*.java
