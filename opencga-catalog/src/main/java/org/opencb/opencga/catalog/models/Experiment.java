/*
 * Copyright 2015 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencb.opencga.catalog.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by imedina on 11/09/14.
 */
public class Experiment {

    private int id;
    private String name;
    private String type;
    private String platform;
    private String manufacturer;
    private String date;
    private String lab;
    private String center;
    private String responsible;
    private String description;

    private Map<String, Object> attributes;


    public Experiment() {
    }

    public Experiment(int id, String name, String type, String platform, String manufacturer, String date,
                      String lab, String center, String responsible, String description) {
        this(id, name, type, platform, manufacturer, date, lab, center, responsible,
                description, new HashMap<String, Object>());
    }

    public Experiment(int id, String name, String type, String platform, String manufacturer, String date,
                      String lab, String center, String responsible, String description, Map<String, Object> attributes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.platform = platform;
        this.manufacturer = manufacturer;
        this.date = date;
        this.lab = lab;
        this.center = center;
        this.responsible = responsible;
        this.description = description;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Experiment{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", platform='").append(platform).append('\'');
        sb.append(", manufacturer='").append(manufacturer).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", lab='").append(lab).append('\'');
        sb.append(", center='").append(center).append('\'');
        sb.append(", responsible='").append(responsible).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", attributes=").append(attributes);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

}
