grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolver = "maven" // or ivy

def SP = { key, _default='' -> [System.properties[key], System.env[key.toUpperCase().replace('.', '_')], _default].find { it != null } }

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenCentral()
        mavenRepo('http://dev.frontlinesms.com/m2repo/') {
            authentication(
                username: SP('FRONTLINESMS_MAVEN_USERNAME'),
                password: SP('FRONTLINESMS_MAVEN_PASSWORD_HTTP')
            )
        }
    }
    dependencies {
        compile 'com.stripe:stripe-java:5.36.0'
    }

    plugins {
        build (":release:3.1.0"){
            export = false
        }
        build ':bails:0.6'
    }
}
