package data;

public class Automatic extends Transmission
{
    public Automatic(String transmissionType, String modelNo, int noOfGears)
    {
        super(transmissionType, modelNo, noOfGears);
    }
    @Override
    public void setGearRatio(double[] gearRatio)
    {
        super.setGearRatio(gearRatio);
    }

    @Override
    public double[] getGearRatio()
    {
        return super.getGearRatio();
    }

    @Override
    public void showSpecs()
    {
        super.showSpecs();
    }
}
