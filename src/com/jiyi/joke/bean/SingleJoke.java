package com.jiyi.joke.bean;

public class SingleJoke {
	public static final String TYPE_JOKE="0";//类型1，和mysql里默认的一样为0
	public static final String TYPE_GIRL="1";//类型2
	public static final String TYPE_OTHERS="3";//类型3
	private String joke_id;
	
	private String user_id;
	private String username;
	private String sex;
	
	private String type;
	private String createtime;
	private String content;
	private String imgurl;
	private String ishasing;
	private String share_count;
	private String collect_count;
	private String look_count;
	
	public SingleJoke(){
		
	}

	public String getJoke_id() {
		return joke_id;
	}

	public void setJoke_id(String joke_id) {
		this.joke_id = joke_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getIshasing() {
		return ishasing;
	}

	public void setIshasing(String ishasing) {
		this.ishasing = ishasing;
	}

	public String getShare_count() {
		return share_count;
	}

	public void setShare_count(String share_count) {
		this.share_count = share_count;
	}

	public String getCollect_count() {
		return collect_count;
	}

	public void setCollect_count(String collect_count) {
		this.collect_count = collect_count;
	}

	public String getLook_count() {
		return look_count;
	}

	public void setLook_count(String look_count) {
		this.look_count = look_count;
	}

	@Override
	public String toString() {
		return "SingleJoke [joke_id=" + joke_id + ", user_id=" + user_id
				+ ", type=" + type + ", createtime=" + createtime
				+ ", content=" + content + ", imgurl=" + imgurl + ", ishasing="
				+ ishasing + ", share_count=" + share_count
				+ ", collect_count=" + collect_count + ", look_count="
				+ look_count + "]";
	}
	
	

}
