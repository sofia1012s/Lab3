public class Video extends Multimedia{
    private float fps;

    public Video(String autor, String fecha, String hora, String URL, float tamano, float fps) {
        super(autor, fecha, hora, URL, tamano);
       this.fps = fps;
       tipo = 3;
    }

    public float getFps() {
        return fps;
    }
}
