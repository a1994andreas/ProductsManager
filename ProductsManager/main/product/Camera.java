package product;

import java.util.Date;

public class Camera extends TechProduct{

	private int megapixels;
	private String sensor;
	private String imageResolution;
	private String videoResolution;

	public Camera() {
		super();
	}
	
	public Camera(float price, Date estimatedDelivery, String name, int guarantee, TechProductBrand brand) {
		super( price, estimatedDelivery, name, guarantee, brand);
	}
		
	public Camera(float price, Date estimatedDelivery, String name, int guarantee, TechProductBrand brand,
			int megapixels,String sensor, String imageResolution, String videoResolution)
	{
		super( price, estimatedDelivery, name, guarantee, brand);
		this.setMegapixels(megapixels);
		this.setSensor(sensor);
		this.setImageResolution(imageResolution);
		this.setVideoResolution(videoResolution);
	}

	
	/**
	 * @return the megapixels
	 */
	public int getMegapixels() {
		return megapixels;
	}

	/**
	 * @param megapixels the megapixels to set
	 */
	public void setMegapixels(int megapixels) {
		this.megapixels = megapixels;
	}

	/**
	 * @return the sensor
	 */
	public String getSensor() {
		return sensor;
	}

	/**
	 * @param sensor the sensor to set
	 */
	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	/**
	 * @return the imageResolution
	 */
	public String getImageResolution() {
		return imageResolution;
	}

	/**
	 * @param imageResolution the imageResolution to set
	 */
	public void setImageResolution(String imageResolution) {
		this.imageResolution = imageResolution;
	}

	/**
	 * @return the videoResolution
	 */
	public String getVideoResolution() {
		return videoResolution;
	}

	/**
	 * @param videoResolution the videoResolution to set
	 */
	public void setVideoResolution(String videoResolution) {
		this.videoResolution = videoResolution;
	}
	
	@Override
	public String toString() {
		return super.toString()+" megapixels: "+megapixels+" sensor: "+sensor+" image resolution: "+imageResolution+" video resolution: "+videoResolution;
	}
}
