package org.pooja;

public class ConsoleInput {

    public static float getFloat() {
        try {
            return Float.parseFloat(getString());
        } catch (Exception e) {
            return 0.0f;
        }
    }

    public static int getInt() {
        try {
            return Integer.parseInt(getString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static boolean getBoolean() {
        try {
            return Boolean.parseBoolean(getString());
        } catch (Exception e) {
            return false;
        }
    }

    public static String getString() {
        try {
            byte arrInput[] = new byte[100];
            int length = System.in.read(arrInput);

            if (length <= 0) return "";

            String objString = new String(arrInput, 0, length).trim();
            return objString;
        } catch (Exception e) {

        }
        return "";
    }
}