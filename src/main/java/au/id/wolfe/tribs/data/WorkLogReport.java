/**
 * Copyright (C) 2010 Mark Wolfe <mark.wolfe@wolfe.id.au>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package au.id.wolfe.tribs.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.collect.Lists;

/**
 * 
 * Data object which contains a list of work log entries.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "WorkLogReport")
public class WorkLogReport {

    @XmlElement(name = "status-code")
    private Integer code;
    private String message;
    
    
    private List<WorkLogEntry> workLogEntryList = Lists.newArrayList();

    public WorkLogReport() {
    }

    public WorkLogReport(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public List<WorkLogEntry> getWorkLogEntryList() {
        return workLogEntryList;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
