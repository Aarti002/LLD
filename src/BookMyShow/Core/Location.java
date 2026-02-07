package BookMyShow.Core;

public class Location {
    private int locationId;
    private String cityName;
    private Double latitude;
    private Double longitude;

    public Location(int id, String cityName, Double lt, Double lg) {
        this.locationId = id;
        this.cityName = cityName;
        this.latitude = lt;
        this.longitude = lg;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
