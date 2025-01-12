package org.frameworkset.elasticsearch.client;/*
 *  Copyright 2008 biaoping.yin
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import com.frameworkset.util.SimpleStringUtil;
import org.frameworkset.elasticsearch.boot.ElasticSearchBoot;

public abstract class DataStream {


	public void setExternalTimer(boolean externalTimer) {

	}

	public abstract void execute() throws ESDataImportException;

	public abstract void stop();

	public String getConfigString() {
		return configString;
	}

	public void setConfigString(String configString) {
		this.configString = configString;
	}

	private String configString;

	protected void initES(String applicationPropertiesFile){
		if(SimpleStringUtil.isNotEmpty(applicationPropertiesFile ))
			ElasticSearchBoot.boot(applicationPropertiesFile);
	}
	public void init() {
	}
}
