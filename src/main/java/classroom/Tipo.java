package classroom;

public enum Tipo {
	DISCIPLINAR,FUNDAMENTACION,ELECTIVA;
	
	public int codigo;
	public String nombre;
	
	public void Tipos(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
