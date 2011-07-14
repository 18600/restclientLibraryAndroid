package no.uka.findmyapp.android.rest.datamodels;
import java.io.Serializable;
import java.sql.Date;

public class UkaEvent implements Serializable {
	private int id;
	
    /**
     */
	private int eventId;
	
    /**
     */
	private int billingid;
	
    /**
     */
	private int entranceId;
	
    /**
     */
	private String title;
	
	/**
	 */
	private String lead;
	
	/**
	 */
	private String text;
	
    /**
     */
	private String place;
	
    /**
     */
	private String eventType;
	
    /**
     */
	private String image;

    /**
     */
	private String thumbnail;
	
    /**
     */
	private boolean hidden_from_listings;
	
    /**
     */
	private String slug;
	
    /**
     */
	private int ageLimit;
	
    /**
     */
	private int detailPhotoId;
	
	/**
     */
	/*
    private Date showingTime;
    
    /**
     */
	/*
    private Date publishTime;
    
    /**
     */
	/*
    private Date netsaleFrom;
    
    /**
     */
	/*
    private Date netsaleTo;
    
    /**
     */
	private boolean free;
	
	 /**
     */
	private boolean canceled;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getBillingid() {
		return billingid;
	}

	public void setBillingid(int billingid) {
		this.billingid = billingid;
	}

	public int getEntranceId() {
		return entranceId;
	}

	public void setEntranceId(int entranceId) {
		this.entranceId = entranceId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLead() {
		return lead;
	}

	public void setLead(String lead) {
		this.lead = lead;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public boolean isHidden_from_listings() {
		return hidden_from_listings;
	}

	public void setHidden_from_listings(boolean hidden_from_listings) {
		this.hidden_from_listings = hidden_from_listings;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getDetailPhotoId() {
		return detailPhotoId;
	}

	public void setDetailPhotoId(int detailPhotoId) {
		this.detailPhotoId = detailPhotoId;
	}

	/*
	public Date getShowingTime() {
		return showingTime;
	}

	public void setShowingTime(Date showingTime) {
		this.showingTime = showingTime;
	}

	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getNetsaleFrom() {
		return netsaleFrom;
	}

	public void setNetsaleFrom(Date netsaleFrom) {
		this.netsaleFrom = netsaleFrom;
	}

	public Date getNetsaleTo() {
		return netsaleTo;
	}

	public void setNetsaleTo(Date netsaleTo) {
		this.netsaleTo = netsaleTo;
	}

*/
	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}

	@Override
	public String toString() {
		return "UkaEvent [id=" + id + ", eventId=" + eventId + ", billingid="
				+ billingid + ", entranceId=" + entranceId + ", title=" + title
				+ ", lead=" + lead + ", text=" + text + ", place=" + place
				+ ", eventType=" + eventType + ", image=" + image
				+ ", thumbnail=" + thumbnail + ", hidden_from_listings="
				+ hidden_from_listings + ", slug=" + slug + ", ageLimit="
				+ ageLimit + ", detailPhotoId=" + detailPhotoId
				+ ", free=" + free + ", canceled=" + canceled + "]";
	}

}