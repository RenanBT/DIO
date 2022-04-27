function getAdmins(map) {
    let admins = [];
    for([key, value] of map){
        if(value === 'Admin'){
            admins.push(key);
        }
    }
    return admins;
}

const users = new Map();

users.set('Renan', 'Admin');
users.set('Tais', 'Admin');
users.set('Maria', 'User');
users.set('Nelson', 'User');

console.log(getAdmins(users));