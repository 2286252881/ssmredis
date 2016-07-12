package com.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private Integer id;

    private String username;

    private String pwd;

    private Date createdate;

    private String flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

	@Override
	public String toString() {
		return "[id=" + id + ", username=" + username + ", pwd=" + pwd + ", createdate=" + createdate
				+ ", flag=" + flag + "]";
	}
}