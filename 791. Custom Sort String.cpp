#include<bits/stdc++.h>
using namespace std;


// create a main function in C++
int main() {

    string order , string_to_sort,ans="";
    // enter variables 
    cin >> order >> string_to_sort;
    // calculate frequency of each character in the second string
    // assign characters of second string into a set of characters
    set<char> s;
    for(int i=0;i<string_to_sort.size();i++){
        s.insert(string_to_sort[i]);
    }

    int freq1[26]={0},freq2[26]={0};
    for(int i=0;i<order.size();i++)
        freq1[order[i]-'a']++;
    // calcualte frequency of each character in the second string
    for(int i=0;i<string_to_sort.size();i++){
        freq2[string_to_sort[i]-'a']++;
    }

    // check if the characters of first string is also present in second string
    for(int i=0;i<order.size();i++)
        if(freq2[order[i]-'a']>0)
            for (int j = 0; j < freq2[order[i] - 'a'];j++)
                ans+=order[i];
    // check if the characters of second string is not also present in first string
     for(auto it=s.begin();it!=s.end();it++){
        // if the character is not present in first string
        if(freq1[*it-'a']==0)
            // run loop till freq2 from 0 to freq[*it]
            for(int i=0;i<freq2[*it-'a'];i++){
                // add the character to ans
                ans+=*it;
            }
    }
    

    }
    // print the sorted string
    cout << ans;


                return 0;
}