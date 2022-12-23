<template>
  <div class="mx-auto max-w-7xl px-2 sm:px-6 lg:px-8">
    <div class="flex-1 p:2 sm:p-6 flex flex-col h-screen">
<!--  header area  -->
      <div class="flex sm:items-center justify-between py-3">
        <div class="relative flex items-center space-x-4">
          <div class="relative">
            <span class="absolute text-green-500 right-0 bottom-0">
               <svg width="20" height="20">
                  <circle cx="8" cy="8" r="8" fill="currentColor"></circle>
               </svg>
            </span>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="" class="w-10 sm:w-16 h-10 sm:h-16 rounded-full">
          </div>
          <div class="flex flex-col leading-tight">
            <div class="text-2xl mt-1 flex items-center">
              <span class="mr-3">Anderson Vanhron</span>
            </div>
            <span class="text-lg">Junior Developer</span>
          </div>
        </div>
  <!--  header area - button  -->
        <div class="flex items-center space-x-2">

        </div>
      </div>
<!--  message area  -->
      <div ref="messagesEl" class="h-full flex flex-col space-y-4 p-3 overflow-y-auto scrollbar-thumb-blue scrollbar-thumb-rounded scrollbar-w-2 scrolling-touch rounded-t-lg border-2 border-gray-700">
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">Can be verified on any platform using docker</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Your error message says permission denied, npm global installs must be given root privileges.</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">Command was run with root privileges. I'm sure about that.</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I've update the description so it's more obviously now</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">FYI https://askubuntu.com/a/700266/510172</span>
              </div>
              <div>
                  <span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">
                     Check the line above (it ends with a # so, I'm running it as root )
                     <pre># npm install -g @vue/devtools</pre>
                  </span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Any updates on this issue? I'm getting the same error when trying to install devtools. Thanks</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">Thanks for your message David. I thought I'm alone with this issue. Please, ? the issue to support it :)</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-blue-600 text-white ">Are you using sudo?</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Run this command sudo chown -R `whoami` /Users/{{ your_user_profile }}/.npm-global/ then install the package globally without using sudo</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">It seems like you are from Mac OS world. There is no /Users/ folder on linux ?</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">I have no issue with any other packages installed with root permission globally.</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">yes, I have a mac. I never had issues with root permission as well, but this helped me to solve the problem</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I get the same error on Arch Linux (also with sudo)</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I also have this issue, Here is what I was doing until now: #1076</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">even i am facing</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">Can be verified on any platform using docker</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Your error message says permission denied, npm global installs must be given root privileges.</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">Command was run with root privileges. I'm sure about that.</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I've update the description so it's more obviously now</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">FYI https://askubuntu.com/a/700266/510172</span>
              </div>
              <div>
                  <span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">
                     Check the line above (it ends with a # so, I'm running it as root )
                     <pre># npm install -g @vue/devtools</pre>
                  </span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Any updates on this issue? I'm getting the same error when trying to install devtools. Thanks</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">Thanks for your message David. I thought I'm alone with this issue. Please, ? the issue to support it :)</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-blue-600 text-white ">Are you using sudo?</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Run this command sudo chown -R `whoami` /Users/{{
                  your_user_profile
                }}/.npm-global/ then install the package globally without using sudo</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">It seems like you are from Mac OS world. There is no /Users/ folder on linux ?</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">I have no issue with any other packages installed with root permission globally.</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">yes, I have a mac. I never had issues with root permission as well, but this helped me to solve the problem</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I get the same error on Arch Linux (also with sudo)</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I also have this issue, Here is what I was doing until now: #1076</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">even i am facing</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">Can be verified on any platform using docker</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Your error message says permission denied, npm global installs must be given root privileges.</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">Command was run with root privileges. I'm sure about that.</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">I've update the description so it's more obviously now</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block bg-gray-300 text-gray-600">FYI https://askubuntu.com/a/700266/510172</span>
              </div>
              <div>
                  <span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">
                     Check the line above (it ends with a # so, I'm running it as root )
                     <pre># npm install -g @vue/devtools</pre>
                  </span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Any updates on this issue? I'm getting the same error when trying to install devtools. Thanks</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-2 items-start">
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-bl-none bg-gray-300 text-gray-600">Thanks for your message David. I thought I'm alone with this issue. Please, ? the issue to support it :)</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1549078642-b2ba4bda0cdb?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-1">
          </div>
        </div>
        <div class="chat-message">
          <div class="flex items-end justify-end">
            <div class="flex flex-col space-y-2 text-xs max-w-xs mx-2 order-1 items-end">
              <div><span class="px-4 py-2 rounded-lg inline-block bg-blue-600 text-white ">Are you using sudo?</span>
              </div>
              <div><span class="px-4 py-2 rounded-lg inline-block rounded-br-none bg-blue-600 text-white ">Run this command sudo chown -R `whoami` /Users/{{
                  your_user_profile
                }}/.npm-global/ then install the package globally without using sudo</span>
              </div>
            </div>
            <img
                src="https://images.unsplash.com/photo-1590031905470-a1a1feacbb0b?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=facearea&amp;facepad=3&amp;w=144&amp;h=144"
                alt="My profile" class="w-6 h-6 rounded-full order-2">
          </div>
        </div>
      </div>
<!--  input area  -->
      <div class="flex flex-col items-center py-2 px-3 bg-gray-50 rounded-b-lg dark:bg-gray-700">
        <div class="flex w-full">
          <textarea id="chat" rows="1"
                    class="block p-2.5 w-full h-12 sm:h-24 text-sm text-gray-900 bg-white rounded-lg border border-gray-300 resize-none scrollbar-thumb-blue scrollbar-thumb-rounded scrollbar-w-2 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-800 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
                    placeholder="Your message..."></textarea>
        </div>
        <div class="flex w-full">
          <button type="button"
                  class="inline-flex justify-center p-2 text-gray-500 rounded-lg cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:text-gray-400 dark:hover:text-white dark:hover:bg-gray-600">
            <svg class="w-6 h-6" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
              <path fill-rule="evenodd"
                    d="M4 3a2 2 0 00-2 2v10a2 2 0 002 2h12a2 2 0 002-2V5a2 2 0 00-2-2H4zm12 12H4l4-8 3 6 2-4 3 6z"
                    clip-rule="evenodd"></path>
            </svg>
          </button>
          <button type="button"
                  class="p-2 text-gray-500 rounded-lg cursor-pointer hover:text-gray-900 hover:bg-gray-100 dark:text-gray-400 dark:hover:text-white dark:hover:bg-gray-600">
            <svg class="w-6 h-6" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
              <path fill-rule="evenodd"
                    d="M10 18a8 8 0 100-16 8 8 0 000 16zM7 9a1 1 0 100-2 1 1 0 000 2zm7-1a1 1 0 11-2 0 1 1 0 012 0zm-.464 5.535a1 1 0 10-1.415-1.414 3 3 0 01-4.242 0 1 1 0 00-1.415 1.414 5 5 0 007.072 0z"
                    clip-rule="evenodd"></path>
            </svg>
          </button>
          <button type="submit"
                  class="inline-flex justify-center p-2 text-blue-600 rounded-full cursor-pointer hover:bg-blue-100 dark:text-blue-500 dark:hover:bg-gray-600 ml-auto">
            <svg class="w-6 h-6 rotate-90" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
              <path
                  d="M10.894 2.553a1 1 0 00-1.788 0l-7 14a1 1 0 001.169 1.409l5-1.429A1 1 0 009 15.571V11a1 1 0 112 0v4.571a1 1 0 00.725.962l5 1.428a1 1 0 001.17-1.408l-7-14z"></path>
            </svg>
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import {onMounted, ref} from 'vue';

const messagesEl = ref(null)
onMounted(() => {
  messagesEl.value.scrollTop = messagesEl.value.scrollHeight
})

const your_user_profile = '###############'

/*
* todo
*
* 메시지가 들어왔을 때 이전 메시지와 주인이 다르면 타인 시작 타입 메시지 출력하고 같다면 타인 일반 타입 메시지 출력
* 자신의 메시지도 마찬가지로 자신 시작 타입 메시지와 자신 일반 타입 메시지로 출력
*
* */

</script>

<style scoped>
.scrollbar-w-2::-webkit-scrollbar {
  width: 0.25rem;
  height: 0.25rem;
}

.scrollbar-thumb-blue::-webkit-scrollbar-thumb {
  background-color: #edf2f7;
  @apply bg-neutral-50
}

.scrollbar-thumb-rounded::-webkit-scrollbar-thumb {
  border-radius: 0.25rem;
}
</style>