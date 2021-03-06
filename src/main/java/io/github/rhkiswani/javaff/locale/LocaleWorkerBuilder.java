/*
 * Copyright 2016 Mohamed Kiswani.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.rhkiswani.javaff.locale;

import java.util.Locale;

/**
 * @author Mohamed Kiswani
 * @since 0.0.1
 *
 */
public class LocaleWorkerBuilder {
    private LocaleWorker worker = new DefaultLocaleWorker();

    public LocaleWorkerBuilder name(String name){
        worker.setName(name);
        return this;
    }

    public LocaleWorkerBuilder path(String path){
        worker.setPath(path);
        return this;
    }

    public LocaleWorkerBuilder locale(Locale locale){
        worker.setLocale(locale);
        return this;
    }

    public LocaleWorker build(){
        worker.reload();
        return worker;
    }
}
