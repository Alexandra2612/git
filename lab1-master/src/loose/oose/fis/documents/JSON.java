package loose.oose.fis.documents;

import java.util.Arrays;

public class JSON extends Document {
    public JSON(String[] continut) {
        super(continut);
    }

    @Override
    public String[] analizeaza() {
        String[] res = new String[continut.length];
        int      pozz = 0;

        for (String cuvant : continut) {
            if (!cuvant.contains(":")) {
                res[pozz] = cuvant;
                pozz++;
            }
        }

        return Arrays.copyOf(res, pozz);
    }

    @Override
    public String toString() {
        return "JSON " + super.toString();
    }
}
