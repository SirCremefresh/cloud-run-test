const fetch = require("node-fetch");

(async () => {
    for (let i = 0; i < 1000; i++) {
        console.log("start");

        await Promise.all(new Array(100)
            .fill(1)
            .map((val, index) => fetch('https://cloud-run-test-2hkyri65qq-ew.a.run.app/system/ping')
                .then(() => console.log('finish index: ' + index))))

        console.log("finish");
    }
})();

