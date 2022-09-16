<script setup>
import {useRoute, useRouter} from 'vue-router';

const props = defineProps({
  routerName: {
    type: String,
    required: true
  }
});

const route = useRoute();
const router = useRouter();
const clickMenu = (routerName) => {
  router.push({
    name: routerName
  })
}

// div 추가

</script>

<template>
  <div
    class="menu-item"
    :class="{ selected: route.name === routerName }"
    @click="clickMenu(routerName)"
  >
    <slot></slot>
  </div>
</template>

<style lang="scss" scoped>
.menu-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  width: 100px;
  cursor: pointer;

  &:hover {
    background-color: $SELECTED-MENU;
  }

  &.selected {
    position: relative;

    &:after {
      content: '';
      display: block;
      width: 100%;
      height: 5px;
      background-color: #ffffff;
      position: absolute;
      left: 0;
      bottom: 0;
    }
  }
}
</style>