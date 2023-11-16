limpiar:
	rm -rf bin
	rm -rf html
compilar:limpiar
	mkdir bin
	find src -name "*.java" | xargs javac -cp bin -d bin
ejecutar:compilar
	java -cp bin aplicacion.Principal