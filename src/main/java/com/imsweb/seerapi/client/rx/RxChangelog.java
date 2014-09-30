/*
 * Copyright (C) 2013 Information Management Services, Inc.
 */
package com.imsweb.seerapi.client.rx;

import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class RxChangelog {

    @JsonProperty("id")
    protected String _displayId;
    @JsonProperty("adds")
    private List<RxChangelogEntry> _adds;
    @JsonProperty("deletes")
    private List<RxChangelogEntry> _deletes;
    @JsonProperty("mods")
    private List<RxChangelogEntry> _mods;
    @JsonProperty("user")
    private String _user;
    @JsonProperty("date")
    private Date _date;
    @JsonProperty("version")
    private String _version;
    @JsonProperty("description")
    private String _description;

    public String getId() {
        return _displayId;
    }

    public List<RxChangelogEntry> getAdds() {
        return _adds;
    }

    public List<RxChangelogEntry> getDeletes() {
        return _deletes;
    }

    public List<RxChangelogEntry> getMods() {
        return _mods;
    }

    public String getUser() {
        return _user;
    }

    public Date getDate() {
        return _date;
    }

    public String getVersion() {
        return _version;
    }

    public String getDescription() {
        return _description;
    }
}
