package pl.robertburek.carsfactory;

/**
 * Created by Robert Burek
 */
public interface Factory {

    Car buildFord(FordModel model);

    Car buildBmw(BmwModel model);
}
