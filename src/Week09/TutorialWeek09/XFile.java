package Week09.TutorialWeek09;

public class XFile {
    public static byte[] read(String path) throws java.io.IOException {
        try {
            java.io.FileInputStream fis = new java.io.FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();

            return data;
        } catch (Exception e) {
            throw new java.io.IOException(e);
        }
    }

    public static void write(String path, byte[] data) throws java.io.IOException {
        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            throw new java.io.IOException(e);
        }
    }

    public static void writeObject(String path, Object obj) throws java.io.IOException {
        try {
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(new java.io.FileOutputStream(path));
            oos.writeObject(obj);
            oos.close();
        } catch (Exception e) {
            throw new java.io.IOException(e);
        }
    }

    public static Object readObject(String path) throws java.io.IOException {
        try {
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream(path));
            return ois.readObject();
        } catch (Exception e) {
            throw new java.io.IOException(e);
        }
    }
}
