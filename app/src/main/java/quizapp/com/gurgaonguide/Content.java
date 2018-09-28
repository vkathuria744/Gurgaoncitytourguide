package quizapp.com.gurgaonguide;

public class Content {

    private static final int NO_IMAGE = -1;

    private int mTitle;

    private int mAddress;

    private int mImageResourceId = NO_IMAGE;

    private double mRating;

    private int mMaterial;

    public Content(int title,int address, int material, int image, double rating){

        mTitle = title;
        mAddress = address;
        mImageResourceId = image;
        mMaterial = material;
        mRating = rating;
    }

    public Content(int title, int address, int material, double rating){

        mTitle = title;
        mRating = rating;
        mAddress = address;
        mMaterial = material;
    }

    public int getImageResourceId(){return mImageResourceId;}

    public int getAddress(){return mAddress;}

    public float getRating() {return (float) mRating; }

    public int getTitle() {return mTitle;}

    public int getMaterial() {return mMaterial;}

    public boolean hasImage() {return mImageResourceId !=NO_IMAGE;}
}
