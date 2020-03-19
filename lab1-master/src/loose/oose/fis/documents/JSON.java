package loose.oose.fis.documents;

import java.util.Arrays;

public class JSON extends Document {
    public JSON(String[] continut) {
        super(continut);
    }

    @Override
    public String[] analizeaza() {
        String[] res = new String[continut.length];
        int      p = 0;

        for (String cuvant : continut) {
            if (!cuvant.contains(":")) {
                res[p] = cuvant;
                p++;
            }
        }

        return Arrays.copyOf(res, p);
    }

    @Override
    public String toString() {
        return "JSON " + super.toString();
    }
}
