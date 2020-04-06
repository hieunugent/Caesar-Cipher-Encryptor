JC=javac
JA=java
SC=source


default: junit clean complie run

junit:
	$(SC) ~/.bash_profile
clean:
	rm -f *.class
complie:
	$(JC) *.java
run:
	$(JA) TestRunner
