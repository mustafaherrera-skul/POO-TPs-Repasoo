// Notificacion.java
public class Notificacion {
    private String destinatario;

    public Notificacion(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar(String mensaje) {
        System.out.println("«Enviando notificación general a" + destinatario + "»");
    }
}

// Email

public class Email extends Notificacion {
    private String asunto;

    public Email(String destinatario, String asunto) {
        super(destinatario);
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public void enviar(String mensaje) {
        if (mensaje.length() == 0) {
            System.out.println("Demasiados caracteres");
        }
        System.out.println("Tipo de nofiticacion: Email; Asunto:" + asunto + "; mensaje: " + mensaje);

    }

}

// SMS

public class SMS extends Notificacion {
    private String numeroTelefono;

    public SMS(String destinatario, String numeroTelefono) {
        super(destinatario);
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviar(String mensaje) {
        if (mensaje.length() >= 160) {
            System.out.println("Demasiados caracteres");
        }
        System.out.println("Tipo de nofiticacion: SMS; número de telefono:" + numeroTelefono + "; mensaje: " + mensaje);

    }

}

// Main

public class main(){

    public static void main(String[] args) {
        Email email = new Email("asd", "pepe123");
        SMS SMS = new SMS("asd", "1234556");
        Email.enviar("holaaa");
        Email.enviar("holaaa");

    }
}