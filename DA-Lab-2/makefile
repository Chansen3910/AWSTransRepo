
MAKEFLAGS += --silent
ROOTDIR=DA-Lab-2
PACKAGE=labtwo
JARNAME=JavaMake.jar
MAIN=tech.collin.$(PACKAGE).Main
SOURCE=src/tech/collin/$(PACKAGE)/
FILES=-C build .
DEPENDENCIES=-cp $(ROOTDIR)/external/*.jar

clean: archive
	rm -r ./build/

archive: manifest
	jar cfM $(JARNAME) $(FILES)

manifest: compile
	mkdir ./build/META-INF/
	cp ./MANIFEST.MF ./build/META-INF/

compile:
	javac $(DEPENDENCIES) -d ./build $(SOURCE)*.java
