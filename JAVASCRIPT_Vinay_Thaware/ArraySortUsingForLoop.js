let num=[10,5,15,25,20,60]

for (let  i= 0; i< num.length; i++) 
    

    for (let j=0; j < i; j++) 
          
        if(num[i]<num[j]){
          let x=num[i];
          num[i]=num[j]
          num[j]=x

        }
         console.log(num);
        
        
   
   
