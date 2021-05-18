package pgn.exUD4;
public class Gato extends Mamifero {
  public Gato (String nombre, int edad) throws EdadErroneaException {
      setAge(edad);
      this.nombre = nombre;
  }

  public static String maullar() {
      return "Miauuuuuuuuuuuuu";
  }

}
