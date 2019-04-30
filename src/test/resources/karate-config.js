function fn() {
    var env = karate.env; // get java system property 'karate.env'
    karate.log('karate.env system property was:', env);
    if (!env) {
        env = 'dev';
    }
    var config = {
        jsonURL: 'http://localhost:8080/user-json',
        xmlURL: 'http://localhost:8080/user-xml'
    };
    if (env == 'dev') {
        // over-ride only those that need to be
        config.jsonURL = 'http://localhost:8080/user-json';
        config.xmlURL = 'http://localhost:8080/user-xml';
        config.postJsonURL = 'http://localhost:8080/user-post-json';
    }
    //This env is used in integration testing via jenkins
    else if (env == 'e2e') {
        config.jsonURL = 'http://someurl.com/user-json';
        config.xmlURL = 'http://someurl.com/user-json';
        config.postJsonURL = 'http://someurl.com/user-post-json';
    }
    return config;
}