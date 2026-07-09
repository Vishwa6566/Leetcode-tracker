// Last updated: 7/9/2026, 10:40:43 AM
class Solution {
public:
    vector<string> findRepeatedDnaSequences(string s) {

        vector<string> result;

        // No 10-letter substring is possible
        if (s.length() < 10) {
            return result;
        }

        unordered_set<string> seen;
        unordered_set<string> repeated;

        for (int i = 0; i <= s.length() - 10; i++) {
            string sub = s.substr(i, 10);

            if (seen.count(sub)) {
                repeated.insert(sub);
            } else {
                seen.insert(sub);
            }
        }

        for (string seq : repeated) {
            result.push_back(seq);
        }

        return result;
    }
};