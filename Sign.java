public class Sign {

    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        if (message.length() == 0) {
            return 0;
        }

        int lines = message.length() / width;

        if (message.length() % width != 0) {
            lines = lines + 1;
        }

        return lines;
    }

    public String getLines() {
        if (message.length() == 0) {
            return null;
        }

        String result = "";
        int index = 0;

        while (index < message.length()) {
            int tempEnd = index + width;

            if (tempEnd > message.length()) {
                tempEnd = message.length();
            }

            result += message.substring(index, tempEnd);
            index = tempEnd;

            if (index < message.length()) {
                result += ";";
            }
        }

        return result;
    }
}

