import { createApp } from 'vue'
import App from './App.vue'
import './main.css'
import router from '@/routes';
import vuex from '@/store';

createApp(App)
  .use(router)
  .use(vuex)
  .mount('#app')

