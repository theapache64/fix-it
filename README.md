# fix-it  :construction:
A simple CLI tool to simplify recurring tasks

## Usage

### Android Studio

#### XML

- `fix-it xml` : To set `XML` code style to `Android`

**Working**

Add 

```xml
    <AndroidXmlCodeStyleSettings>
      <option name="USE_CUSTOM_SETTINGS" value="true" />
    </AndroidXmlCodeStyleSettings>
```

To  ` .idea/codeStyles/Project.xml`'s  `component.code_scheme`

& 

Add

```xml
<XML>
      <option name="XML_KEEP_LINE_BREAKS" value="false" />
      <option name="XML_ALIGN_ATTRIBUTES" value="false" />
      <option name="XML_SPACE_INSIDE_EMPTY_TAG" value="true" />
    </XML>
    <codeStyleSettings language="XML">
      <option name="FORCE_REARRANGE_MODE" value="1" />
      <indentOptions>
        <option name="CONTINUATION_INDENT_SIZE" value="4" />
      </indentOptions>
      <arrangement>
        <rules>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>xmlns:android</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>xmlns:.*</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
              <order>BY_NAME</order>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*:id</NAME>
                  <XML_NAMESPACE>http://schemas.android.com/apk/res/android</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*:name</NAME>
                  <XML_NAMESPACE>http://schemas.android.com/apk/res/android</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>name</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>style</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
              <order>BY_NAME</order>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*</NAME>
                  <XML_NAMESPACE>http://schemas.android.com/apk/res/android</XML_NAMESPACE>
                </AND>
              </match>
              <order>ANDROID_ATTRIBUTE_ORDER</order>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*</NAME>
                  <XML_NAMESPACE>.*</XML_NAMESPACE>
                </AND>
              </match>
              <order>BY_NAME</order>
            </rule>
          </section>
        </rules>
      </arrangement>
    </codeStyleSettings>
```

To  ` .idea/codeStyles/Project.xml`'s  `component.code_scheme` after `JetCodeStyleSettings`

So, final file will look like this

```xml
<component name="ProjectCodeStyleConfiguration">
  <code_scheme name="Project" version="173">
    <AndroidXmlCodeStyleSettings>
      <option name="USE_CUSTOM_SETTINGS" value="true" />
    </AndroidXmlCodeStyleSettings>
    <JetCodeStyleSettings>
      <option name="CODE_STYLE_DEFAULTS" value="KOTLIN_OFFICIAL" />
    </JetCodeStyleSettings>
    <XML>
      <option name="XML_KEEP_LINE_BREAKS" value="false" />
      <option name="XML_ALIGN_ATTRIBUTES" value="false" />
      <option name="XML_SPACE_INSIDE_EMPTY_TAG" value="true" />
    </XML>
    <codeStyleSettings language="XML">
      <option name="FORCE_REARRANGE_MODE" value="1" />
      <indentOptions>
        <option name="CONTINUATION_INDENT_SIZE" value="4" />
      </indentOptions>
      <arrangement>
        <rules>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>xmlns:android</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>xmlns:.*</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
              <order>BY_NAME</order>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*:id</NAME>
                  <XML_NAMESPACE>http://schemas.android.com/apk/res/android</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*:name</NAME>
                  <XML_NAMESPACE>http://schemas.android.com/apk/res/android</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>name</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>style</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*</NAME>
                  <XML_NAMESPACE>^$</XML_NAMESPACE>
                </AND>
              </match>
              <order>BY_NAME</order>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*</NAME>
                  <XML_NAMESPACE>http://schemas.android.com/apk/res/android</XML_NAMESPACE>
                </AND>
              </match>
              <order>ANDROID_ATTRIBUTE_ORDER</order>
            </rule>
          </section>
          <section>
            <rule>
              <match>
                <AND>
                  <NAME>.*</NAME>
                  <XML_NAMESPACE>.*</XML_NAMESPACE>
                </AND>
              </match>
              <order>BY_NAME</order>
            </rule>
          </section>
        </rules>
      </arrangement>
    </codeStyleSettings>
    <codeStyleSettings language="kotlin">
      <option name="CODE_STYLE_DEFAULTS" value="KOTLIN_OFFICIAL" />
    </codeStyleSettings>
  </code_scheme>
</component>
```
